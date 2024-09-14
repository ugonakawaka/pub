import Foundation

do {
    enum Planet {
        case mercury, venus, earth, mars, jupiter, saturn, uranus, neptune
    }

    let somePlanet = Planet.earth
    switch somePlanet {
    case .earth:
        print("Mostly harmless")
    default:
        print("Not a safe place for humans")
    }
}
