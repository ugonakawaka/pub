import Lake
open Lake DSL

package «a000» {
  -- add package configuration options here
}

lean_lib «A000» {
  -- add library configuration options here
}

@[default_target]
lean_exe «a000» {
  root := `Main
}
