# SwiftApp Development Guide

## Build & Run Commands
- Build: `./build.sh`
- Run: `./SpeechApp [text] [voice_name]`
- Debug: `swift build -c debug`

## Code Style Guidelines
- **Naming**: Use camelCase for variables/functions, PascalCase for types
- **Comments**: Use `///` for documentation, `//` for implementation notes
- **Imports**: Group Foundation/AVFoundation first, then project imports
- **Errors**: Use descriptive error messages and guard statements
- **Types**: Use strong typing with clearly defined protocols/interfaces
- **Formatting**: 4-space indentation, 100 character line limit
- **Access Control**: Mark properties as private/internal unless needed externally
- **Constants**: Use static constants for fixed values in enums
- **Documentation**: Document all public interfaces with parameter/return descriptions
- **Models**: Use structs for value types, classes for reference types with inheritance

## Project Structure
- Models.swift: Data structures
- Constants.swift: Application-wide constants
- ServiceName.swift: Service implementations
- XxxController.swift: Coordination logic