import SwiftUI

struct AnimeTestView: View {
    @State var rotation = 0.0
    
    var body: some View {
        Rectangle()
            .fill(.red)
            .frame(width: 200, height: 200)
            .rotationEffect(.degrees(rotation))
            .animation(.easeInOut(duration: 3).delay(1), value: rotation)
            .onTapGesture {
                rotation += 360
            }
    }
}


struct AnimeTestView_Previews: PreviewProvider {
    static var previews: some View {
        AnimeTestView()
    }
}
