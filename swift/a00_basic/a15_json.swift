import Foundation

// struct Coordinate {
//     var latitude: Double
//     var longitude: Double
//     var elevation: Double

//     enum CodingKeys: String, CodingKey {
//         case latitude
//         case longitude
//         case additionalInfo
//     }

//     enum AdditionalInfoKeys: String, CodingKey {
//         case elevation
//     }
// }

// extension Coordinate: Decodable {
//     init(from decoder: Decoder) throws {
//         let values = try decoder.container(keyedBy: CodingKeys.self)
//         latitude = try values.decode(Double.self, forKey: .latitude)
//         longitude = try values.decode(Double.self, forKey: .longitude)

//         let additionalInfo = try values.nestedContainer(keyedBy: AdditionalInfoKeys.self, forKey: .additionalInfo)
//         elevation = try additionalInfo.decode(Double.self, forKey: .elevation)
//     }
// }

// ====================

do { // https://developer.apple.com/documentation/foundation/archives_and_serialization/encoding_and_decoding_custom_types
    struct Coordinate: Codable {
        var latitude: Double
        var longitude: Double
    }

    struct Landmark: Codable {
        // Double, String, and Int all conform to Codable.
        var name: String
        var foundingYear: Int

        // Adding a property of a custom Codable type maintains overall Codable conformance.
        var location: Coordinate
    }

    let landmark = Landmark(name: "Pear", foundingYear: 1, location: Coordinate(latitude: 0, longitude: 1))

    let encoder = JSONEncoder()
    encoder.outputFormatting = .prettyPrinted

    let data = try encoder.encode(landmark)
    print(String(data: data, encoding: .utf8)!)
}

do { // json decoder
    print("=================")
    struct GroceryProduct: Codable {
        var name: String
        var points: Int
        var description: String?
    }

    let json = """
    {
        "name": "Durian",
        "points": 600,
        "description": "A fruit with a distinctive scent."
    }
    """.data(using: .utf8)!

    let decoder = JSONDecoder()
    let product = try decoder.decode(GroceryProduct.self, from: json)

    print(product.name) // Prints "Durian"
}

do { // json encoder
    print("=================")

    struct GroceryProduct: Codable {
        var name: String
        var points: Int
        var description: String?
    }

    let pear = GroceryProduct(name: "Pear", points: 250, description: "A ripe pear.")

    let encoder = JSONEncoder()
    encoder.outputFormatting = .prettyPrinted

    let data = try encoder.encode(pear)
    print(String(data: data, encoding: .utf8)!)

    /* Prints:
     {
       "name" : "Pear",
       "points" : 250,
       "description" : "A ripe pear."
     }
     */
}

do { // Encodable
    print("=================")
    struct Person: Encodable {
        let name: String
        let age: Int
        let email: String
        let nickname: String
    }

    let person = Person(name: "test", age: 1, email: "aaaa@aaaa", nickname: "abc")

    let encoder = JSONEncoder()
    encoder.outputFormatting = .prettyPrinted

    let jsonData = try encoder.encode(person)
    let jsonString = String(data: jsonData, encoding: .utf8)!

    print(jsonString)
}
