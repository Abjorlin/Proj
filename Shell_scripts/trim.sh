awk '{if (!($7-$6 == $8 || $11-$10 == $12)) print $1,$2,$6,$7,$8,$10,$11,$12}' $1 > gigadatatrim.txt
