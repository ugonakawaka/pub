
import AppKit

enum ImageFormat {
    case png
    case jpeg(compressionFactor: CGFloat)
}

func saveImage(_ image: NSImage, to url: URL, as format: ImageFormat) {
    guard let cgImage = image.cgImage(forProposedRect: nil, context: nil, hints: nil) else {
        print("Failed to create CGImage from NSImage")
        return
    }
    
    let bitmapRep = NSBitmapImageRep(cgImage: cgImage)
    
    let fileProperties: [NSBitmapImageRep.PropertyKey: Any]
    let fileType: NSBitmapImageRep.FileType
    switch format {
    case .png:
        fileProperties = [:]
        fileType = .png
    case .jpeg(let compressionFactor):
        fileProperties = [.compressionFactor: compressionFactor]
        fileType = .jpeg
    }
    
    guard let imageData = bitmapRep.representation(using: fileType, properties: fileProperties) else {
        print("Failed to create image representation")
        return
    }
    
    do {
        try imageData.write(to: url)
    } catch {
        print("Failed to write image data to disk: \(error)")
    }
}

func resizeImage(inputImage: CGImage, targetSize: CGSize) -> CGImage? {
    let width = Int(targetSize.width)
    let height = Int(targetSize.height)
    let bitsPerComponent = inputImage.bitsPerComponent
    let bytesPerRow = inputImage.bytesPerRow
    let colorSpace = inputImage.colorSpace
    let bitmapInfo = inputImage.bitmapInfo
    
    guard let context = CGContext(
        data: nil,
        width: width,
        height: height,
        bitsPerComponent: bitsPerComponent,
        bytesPerRow: 0,
        space: colorSpace!,
        bitmapInfo: bitmapInfo.rawValue
    ) else {
        return nil
    }
    
    context.interpolationQuality = .high
    context.draw(inputImage, in: CGRect(origin: .zero, size: targetSize))
    
    return context.makeImage()
}

func resizeImage(inputImage: NSImage, targetSize: NSSize) -> NSImage? {
    guard let cgImage = inputImage.cgImage(forProposedRect: nil, context: nil, hints: nil) else {
        return nil
    }
    
    let width = Int(targetSize.width)
    let height = Int(targetSize.height)
    let bitsPerComponent = cgImage.bitsPerComponent
    let bytesPerRow = 4 * width
    
    let colorSpace = cgImage.colorSpace
    let bitmapInfo = cgImage.bitmapInfo
    
    guard let context = CGContext(data: nil,
                                  width: width,
                                  height: height,
                                  bitsPerComponent: bitsPerComponent,
                                  bytesPerRow: bytesPerRow,
                                  space: colorSpace!,
                                  bitmapInfo: bitmapInfo.rawValue)
    else {
        return nil
    }
    
    context.interpolationQuality = .high
    context.draw(cgImage, in: CGRect(origin: .zero, size: targetSize))
    
    guard let resizedCGImage = context.makeImage() else {
        return nil
    }
    
    let resizedNSImage = NSImage(cgImage: resizedCGImage, size: targetSize)
    return resizedNSImage
}


// ファイルパスから画像のロード
let imageURL = URL(fileURLWithPath: "IMG_1792.HEIC")
// 例として縮小したい画像を読み込む
if let inputImage = NSImage(contentsOf: imageURL) {
    let targetSize = NSSize(width: 100, height: 100) // ターゲットの幅と高さを指定
    if let outputImage = resizeImage(inputImage: inputImage, targetSize: targetSize) {
        let pngURL = URL(fileURLWithPath: "a.png")

        saveImage(outputImage, to: pngURL, as: .png)
    }
}
