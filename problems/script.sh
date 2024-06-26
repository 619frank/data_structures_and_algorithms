find . -type f -name "Theory.md" | while read file; do
    mv "$file" "$(dirname "$file")/Question.md"
done