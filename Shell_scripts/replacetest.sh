field1=$(cut -f1 $1 | sort -u | uniq -u)
field2=$(cut -f2 $1 | sort -u | uniq -u)
printf "$field1\n$field2" > nametrim2.txt
uniqs=$(sort -u nametrim2.txt | uniq -u)
let i=1
for name in $uniqs
do
sed -i "/$name/ s//$i/g" $1
let i++
done
