
import CoreData

do {
    struct User: Codable {
        let name: String
        let userID: String
    }
    let url = URL(string: "https://example.com/endpoint")!
    URLSession.shared
        .dataTaskPublisher(for: url)
        .tryMap { element -> Data in
            guard let httpResponse = element.response as? HTTPURLResponse,
                  httpResponse.statusCode == 200
            else {
                throw URLError(.badServerResponse)
            }
            return element.data
        }
        .decode(type: User.self, decoder: JSONDecoder())
        .sink(receiveCompletion: { print("Received completion: \($0).") },
              receiveValue: { user in print("Received user: \(user).") })
}
