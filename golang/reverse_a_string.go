package main

import (
	"fmt"
)

func main() {
	fmt.Println(stringReverse("Frank"))
}

func stringReverse(x string) string {
	reversed := ""
	for i := len(x) - 1; i >= 0; i-- {
		reversed += string(x[i])
	}
	return reversed

}
