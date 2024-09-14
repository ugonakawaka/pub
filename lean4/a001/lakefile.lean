import Lake
open Lake DSL

package «a001» {
  -- add package configuration options here
}

lean_lib «A001» {
  -- add library configuration options here
}

@[default_target]
lean_exe «a001» {
  root := `Main
}
