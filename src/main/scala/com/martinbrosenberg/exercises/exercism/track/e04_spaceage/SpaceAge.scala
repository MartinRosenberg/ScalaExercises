package com.martinbrosenberg.exercises.exercism.track.e04_spaceage

object SpaceAge {
  type Seconds = Double
  type PlanetYears = Double

  private final val SecondsPerEarthYear = 31557600

  private def age(orbitalPeriod: Double)(seconds: Seconds): PlanetYears =
    seconds / (orbitalPeriod * SecondsPerEarthYear)

  val onMercury: Seconds => PlanetYears = age(0.2408467)
  val onVenus:   Seconds => PlanetYears = age(0.61519726)
  val onEarth:   Seconds => PlanetYears = age(1)
  val onMars:    Seconds => PlanetYears = age(1.8808158)
  val onJupiter: Seconds => PlanetYears = age(11.862615)
  val onSaturn:  Seconds => PlanetYears = age(29.447498)
  val onUranus:  Seconds => PlanetYears = age(84.016846)
  val onNeptune: Seconds => PlanetYears = age(164.79132)
}
