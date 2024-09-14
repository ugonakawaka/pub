-- 証明の開始
theorem add_zero (n : ℕ) : n + 0 = n :=
begin
  -- 帰納法を使用して証明を行います
  induction n with d hd,
  { -- 基底ケース: n = 0の場合
    refl, -- n + 0 = 0 なので、reflを使用して証明を完了
  },
  { -- 帰納ステップ: n = d + 1の場合
    simp [hd], -- 前のステップの結果を使用して証明を進めます
  }
end
