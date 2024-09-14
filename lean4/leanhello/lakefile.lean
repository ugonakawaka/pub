import Lake
open Lake DSL

package «leanhello» {
  -- add package configuration options here
}

lean_lib «Leanhello» {
  -- add library configuration options here
}

@[default_target]
lean_exe «leanhello» {
  root := `Main
}
