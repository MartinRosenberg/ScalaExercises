package com.martinbrosenberg.exercises.exercism.side

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.side.simplecipher.Cipher

/** @version created manually */
class Cipher_Spec extends BaseSpec {

  "Random key cipher - can encode/decode" in {
    // Here we take advantage of the fact that plaintext of "aaa..." outputs the
    // key. This is a critical problem with shift ciphers, some characters will
    // always output the key verbatim.

    val cipher = Cipher(None)
    cipher.encode("aaaaaaaaaa") should be (cipher.key.substring(0, 10))
    cipher.decode(cipher.key.substring(0, 10)) should be ("aaaaaaaaaa")
  }

  "Invalid key - contains caps" in {
    intercept[IllegalArgumentException] {
      Cipher(Some("ABCD"))
    }
  }

  "Invalid key - contains numerics" in {
    intercept[IllegalArgumentException] {
      Cipher(Some("123"))
    }
  }

  "Invalid key - is empty" in {
    intercept[IllegalArgumentException] {
      Cipher(Some(""))
    }
  }

  "Substitution cipher - can encode" in {
    Cipher(Some("abcdefghij")).encode("aaaaaaaaaa") should be ("abcdefghij")
  }

  "Substitution cipher - can decode" in {
    Cipher(Some("abcdefghij")).decode("abcdefghij") should be ("aaaaaaaaaa")
  }

  "Substitution cipher - is reversible" in {
    val cipher = Cipher(Some("abcdefghij"))
    cipher.decode(cipher.encode("abcdefghij")) should be ("abcdefghij")
  }

  "Substitution cipher - can double shift" in {
    val cipher = Cipher(Some("iamapandabear"))
    cipher.encode("iamapandabear") should be ("qayaeaagaciai")
  }

  "Substitution cipher - can wrap" in {
    Cipher(Some("abcdefghij")).encode("zzzzzzzzzz") should be ("zabcdefghi")
  }

}
