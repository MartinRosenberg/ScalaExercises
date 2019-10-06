# Leap

Given a year, report if it is a leap year.

The tricky thing here is that a leap year in the Gregorian calendar occurs:

```text
on every year that is evenly divisible by 4
  except every year that is evenly divisible by 100
    unless the year is also evenly divisible by 400
```

For example, 1997 is not a leap year, but 1996 is. 1900 is not a leap year, but 2000 is.

If your language provides a method in the standard library that does this look-up, pretend it doesn't exist and implement it yourself.

## Notes

Though our exercise adopts some very simple rules, there is more to learn!

For a delightful, four minute explanation of the whole leap year phenomenon, go watch [this youtube video](http://www.youtube.com/watch?v=xX96xng7sAE).

## Hints

Try to avoid code repetition, use private helper functions if you can.

And you might consider using a single `Boolean` expression instead of `if-else` for better readability. See [here](http://cs.wellesley.edu/~cs111/spring00/lectures/boolean-simplification.html) on how this could be done (the link is for Java, but of course the logic is valid for Scala, too).

## Source

JavaRanch Cattle Drive, exercise 3 http://www.javaranch.com/leap.jsp
