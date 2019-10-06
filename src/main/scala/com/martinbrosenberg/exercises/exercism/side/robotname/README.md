# Robot Name

Manage robot factory settings.

When robots come off the factory floor, they have no name.

The first time you boot them up, a random name is generated in the format of two uppercase letters followed by three digits, such as RX837 or BC811.

Every once in a while we need to reset a robot to its factory settings, which means that their name gets wiped. The next time you ask, it will respond with a new random name.

The names must be random: they should not follow a predictable sequence. Random names means a risk of collisions. Your solution must ensure that every existing robot has a unique name.

## Hints

Make sure your solution is general enough to be easily scalable for longer names containing more letters and digits. This usually makes for better code quality, too.

Suggestion (this is not explicitly tested): To make sure you always have a unique name you could implement your own cache or use a `Stream` with its built-in cache.

## Source

A debugging session with Paul Blackwell at gSchool. http://gschool.it
