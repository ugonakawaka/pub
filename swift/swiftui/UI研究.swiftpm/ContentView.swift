import SwiftUI

struct ContentView: View {
    let shareText = "This is the text to share."
    @State private var offset = CGSize.zero
    @State private var showing = false
    @State var scale = 1.0
    
    @State private var isButtonVisible = false
    @State private var buttonOffset: CGFloat = -100
    var body: some View {
        
        ZStack {
            VStack {
                
                VStack {
                    Spacer()
                    if isButtonVisible {
                        Button("Tap Me!") {
                            print("Button Tapped")
                        }
                        .padding()
                        .background(Color.blue)
                        .foregroundColor(Color.white)
                        .clipShape(Circle())
                        .overlay(Circle().stroke(Color.blue, lineWidth: 2))
                        .transition(AnyTransition.move(edge: .bottom))
                    }
                }
                .animation(.easeInOut(duration: 1))
                .onAppear {
                    withAnimation {
                        isButtonVisible = true
                    }
                    DispatchQueue.main.asyncAfter(deadline: .now() + 1.0) {
                        withAnimation {
                            isButtonVisible = false
                        }
                    }
                }
                Text("dummy")
                
                
                Text("Hello, World!")
                    .font(.largeTitle)
                    .foregroundColor(.blue)
                    .opacity(showing ? 1 : 0)
                    .animation(.easeInOut(duration: 2))
                    .onAppear {
                        showing = true
                    }
                if showing {
                    NotificationView().background(.green).frame(width: 200, height: 100).offset(x: buttonOffset)
                    Text("Details go here.").font(.system(size: 32))                    
            
                }
                Text("dummy")
                Spacer()
            }
            VStack {
                
                HStack {
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

                }
                Button(action: {
                    print("tap buton")
                }) {
                    Text("Button")
                        .frame(maxWidth: .infinity, minHeight: 50)
                }
                .accentColor(Color.white)
                .background(Color.blue)
                .cornerRadius(.infinity)
                .padding(.horizontal, 200)
                Spacer()
                Button("show") {
                    isButtonVisible = true
                    withAnimation{
                        showing.toggle()
                    }
                }
                Button("Move") {
                    share()
                    self.buttonOffset = -100
                    withAnimation(.linear(duration: 2)) {
                        self.buttonOffset = 500
                    }
                }
                Spacer()
                
            }.overlay {
                
                
            }
        }
        
    }
    
    func share() {
        let vc = UIActivityViewController(activityItems: [shareText], applicationActivities: [])
        UIApplication.shared.windows.first?.rootViewController?.present(vc, animated: true, completion: nil)
    }
}

struct XxxView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

