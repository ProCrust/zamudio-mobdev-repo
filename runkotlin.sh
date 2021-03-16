DIR=$1
FILE=$2

cd $DIR

echo "Compiling ${FILE}.kt to ${FILE}.jar file..."
kotlinc "${FILE}.kt" -include-runtime -d "${FILE}.jar"

if [[ $? -ne 0 ]]
then (
	echo
	echo "Compilation failed..."
	echo )
else (
	echo
	echo "Successfully created ${FILE}.jar file..."
	echo "Executing ${FILE}.jar file..."	
	echo 
	java -jar ${FILE}.jar
	echo 
	sleep 3
	echo "End of execution..."
	echo "Terminated...")
fi




