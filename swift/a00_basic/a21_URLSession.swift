import Foundation

extension Task where Success == Never, Failure == Never {
    static func sleep(seconds: Double) async throws {
        let duration = UInt64(seconds * 1_000_000_000)
        try await Task.sleep(nanoseconds: duration)
    }
}

do { // timeout
    
	let url = URL(string: "https://deiji.jp")!
    
	var request = URLRequest(url: url, cachePolicy: .reloadIgnoringLocalAndRemoteCacheData,
                             timeoutInterval: 1.0001)
    request.httpMethod = "GET"

    let task = URLSession.shared.dataTask(with: request, completionHandler: { data, response, error in
        dump(data)
        dump(response)
        dump(error)
    })
    task.resume()
    try await Task.sleep(seconds: 6)
}
