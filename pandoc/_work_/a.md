---
article: test
title: タイトル
author: 名前
date: 日付
header-includes: | 
 \usepackage{tikz}
 \usetikzlibrary{positioning}
 \usetikzlibrary{arrows}
---

| The limerick packs laughs anatomical
| In space that is quite economical.
|    But the good ones I've seen
|    So seldom are clean
| And the clean ones so seldom are comical

| 200 Main St.
| Berkeley, CA 94718

| 日本語  
| 東京都


A level-one heading
===================

A level-one heading
===================
A level-two heading
-------------------
# 見出し1

Hellow, Pandoc! a

# 見出し2

## 小見出し1

MarkdownからPDFへの変換テストです。

::: 囲み領域

この領域がどう変換されるか。

:::

数式 
$$
\sum_{i=1}^{10}{i}
$$

$$
\sum_{i=1}^{10}{i}
$$

$$
\begin{aligned}
(x+y)^2 &= (x+y) (x+y) \\
&= x(x+y) + y (x+y) \\
&= x^2 + xy + yx + y^2 \\
&= x^2 + 2xy+y^2
\end{aligned}
$$

地球の赤道半径 $ 6380km = 6.38\times10^{6}m$



$$
\Gamma
\Delta
$$



いろいろできるなー  
ここでテキスト終わり。  

  
  
```{=ms}
.MYMACRO
blah blah
```
```{=openxml}
<w:p>
  <w:r>
    <w:br w:type="page"/>
  </w:r>
</w:p>
```

\newcommand{\tuple}[1]{\langle #1 \rangle}

$\tuple{a, b, c}$

$$\begin{aligned}{2}
& \quad &\text{(2乗の定義)} 公理 0. \exists x(x=x)  \\
\end{aligned}$$
$$


$公理 1.\forall x\forall y(\forall z(z\in x\leftrightarrow z\in y)\to x=y)$

```{=latex}
\begin{flalign}
公理 1.\forall x\forall y(\forall z(z\in x\leftrightarrow z\in y)\to x=y)
\end{flalign}
```

```{=latex}
\begin{flalign}
Expected \; Revenue &= 2.5 \cdot non-passenger \; vehicles + 1.0 \cdot passenger \; vehicles \nonumber \\
&= \$(2.5 \cdot (25 - E(X)) + 1.0 \cdot E(X)) \nonumber \\
&= \$(62.5 - 1.5(E(X))) \nonumber \\
&= \$(62.5 - 1.5 \cdot 15) \nonumber \\
\boldsymbol{Expected \; Revenue} &= \boldsymbol{\$40} \nonumber
\end{flalign}
```

```{=latex}
\begin{tikzpicture}[auto]
\node (a) at (0, 1.2) {$a$}; \node (x) at (1.2, 1.2) {$x$};
\node (b) at (0, 0) {$b$};   \node (y) at (1.2, 0) {$y$};
\draw[->] (a) to node {$\scriptstyle f$} (x);
\draw[->] (x) to node {$\scriptstyle p$} (y);
\draw[->] (a) to node[swap] {$\scriptstyle i$} (b);
\draw[->] (b) to node[swap] {$\scriptstyle g$} (y);
\end{tikzpicture}
```