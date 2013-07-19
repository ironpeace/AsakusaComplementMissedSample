AsakusaComplementMissedSample
=============================

input/modelA.csv

KEYCODE,FIELDA1,FIELDA2
1,fa11,fa21
2,fa12,fa22
3,fa13,fa23


input/modelB.csv

KEYCODE,FIELDB1,FIELDB2
1,fb11,fb21
2,fb12,fb22
4,fb14,fb24


output/joined.csv

KEYCODE,FIELDA1,FIELDA2,FIELDB1,FIELDB2
1,fa11,fa21,fb11,fb21
2,fa12,fa22,fb12,fb22
4,,,fb14,fb24
3,fa13,fa23,,

