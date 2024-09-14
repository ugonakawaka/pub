import SwiftUI

struct ButtonsView: View {
    var body: some View {
        VStack {
            HStack {
                Button(action: {
                    print("タップされました")
                }) {
                    HStack {
                        Image(systemName: "play.circle")
                        Text("開始")
                    }
                }
                Button {
                } label: {
                    Text("Mini")
                }
                .controlSize(.mini)
                
                Button {
                } label: {
                    Text("Small")
                }
                .controlSize(.small)
                
                Button {
                } label: {
                    Text("Regular")
                }
                .controlSize(.regular)
                
                Button {
                } label: {
                    Text("Large")
                }
                .controlSize(.large)
                Button {
                } label: {
                    Text("Rounded")
                }
                .buttonBorderShape(.roundedRectangle)
            }
            
            VStack(spacing: 20) {
                Button("automatic", action: {}).buttonStyle(.automatic)
                Button("bordered", action: {}).buttonStyle(.bordered)
                Button("borderedPriominent", action: {}).buttonStyle(.borderedProminent)
                Button("borderless", action: {}).buttonStyle(.borderless)
                Button("plain", action: {}).buttonStyle(.plain)
            }
        }
    }
}
struct ButtonsView_Previews: PreviewProvider {
    static var previews: some View {
        ButtonsView()
    }
}
