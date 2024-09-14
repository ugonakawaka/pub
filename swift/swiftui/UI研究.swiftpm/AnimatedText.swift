import SwiftUI

struct AnimatedText: View {
    @State private var xOffset: CGFloat = -UIScreen.main.bounds.width
    @State private var scale = 1.0
    @State private var angle: Double = 0
    var body: some View {
        let text = "Hello, world!"
        let textWidth = text.widthOfString(usingFont: .systemFont(ofSize: 32))
        
        return ZStack {
            
            Button("Press here") {
                scale += 1
                angle += 45
            }
            .scaleEffect(scale)
            .rotationEffect(.degrees(angle))
            .animation(.spring(), value: angle)
            

        }
        .onAppear {
            self.xOffset = UIScreen.main.bounds.width
        }
    }
}

extension String {
    func widthOfString(usingFont font: UIFont) -> CGFloat {
        let fontAttributes = [NSAttributedString.Key.font: font]
        let size = self.size(withAttributes: fontAttributes)
        return size.width
    }
}
struct AnimatedText_Previews: PreviewProvider {
    static var previews: some View {
        AnimatedText()
    }
}
