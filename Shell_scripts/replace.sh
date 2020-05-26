uniqs=$(awk '{print $1}' uniqshead500002.txt)
let i=1
for name in $uniqs
do
sed -i "/$name/ s//$i/g" $1
let i++
done

