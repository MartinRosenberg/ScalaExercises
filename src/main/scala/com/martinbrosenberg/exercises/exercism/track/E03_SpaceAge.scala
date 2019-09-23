package com.martinbrosenberg.exercises.exercism.track

/** SPACE AGE
  *
  * Given an age in seconds, calculate how old someone would be on:
  *
  * - Earth: orbital period 365.25 Earth days, or 31557600 seconds
  * - Mercury: orbital period 0.2408467 Earth years
  * - Venus: orbital period 0.61519726 Earth years
  * - Mars: orbital period 1.8808158 Earth years
  * - Jupiter: orbital period 11.862615 Earth years
  * - Saturn: orbital period 29.447498 Earth years
  * - Uranus: orbital period 84.016846 Earth years
  * - Neptune: orbital period 164.79132 Earth years
  *
  * So if you were told someone were 1,000,000,000 seconds old, you should be
  * able to say that they're 31.69 Earth-years old.
  *
  * If you're wondering why Pluto didn't make the cut, go watch this YouTube
  * video: [[http://www.youtube.com/watch?v=Z_2gbGXzFbs]].
  */
object E03_SpaceAge {

  private final val EarthYear = 31557600

  private def age(seconds: Double, orbitalPeriod: Double = 1): Double =
    seconds / (orbitalPeriod * EarthYear)

  def onMercury(seconds: Double): Double = age(seconds, 0.2408467)
  def onVenus  (seconds: Double): Double = age(seconds, 0.61519726)
  def onEarth  (seconds: Double): Double = age(seconds)
  def onMars   (seconds: Double): Double = age(seconds, 1.8808158)
  def onJupiter(seconds: Double): Double = age(seconds, 11.862615)
  def onSaturn (seconds: Double): Double = age(seconds, 29.447498)
  def onUranus (seconds: Double): Double = age(seconds, 84.016846)
  def onNeptune(seconds: Double): Double = age(seconds, 164.79132)

}