cut -d' ' -f1 $1 | sort -u | uniq -u > gigatrim.txt
cut -d' ' -f2 $1 | sort -u | uniq -u >> gigatrim.txt
