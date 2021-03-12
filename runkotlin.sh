DIR=$1
FILE=$2

cd $DIR

echo "creating ${FILE}.jar file..."
kotlinc "${FILE}.kt" -include-runtime -d "${FILE}.jar"

echo "executing ${FILE}.jar file..."
echo
java --illegal-access=permit -jar ${FILE}.jar

