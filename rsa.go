package main

import (
    "fmt"
)

func main() {
	var d, k, fi, n, e, count, t int

    fmt.Scanln(&t)

    var pq [2]int
    
    for test := 0; test < t; test++ {
    	count = 0
    	k = 0
    	fi = 0
    	fmt.Scanln(&n, &e)
    	pq[0] = 0
    	pq[1] = 0

    	//calculate prime factors of n
    	for j := 2; j < n; j++ {
    		if count >= 2 {
    			break
    		}

    		if n % j == 0 {
    			pq[count] = j
    			count++
    		}
    	}

    	//calculate fi
    	fi = (pq[0] - 1) * (pq[1] - 1)

    	//calculate k
    	for i := 0; i < e; i++{
    		if (i * fi + 1) % e == 0 {
    			k = i
    			break
    		}
    	}

    	//calculate private key d
		d = (k * fi + 1) / e

		fmt.Println(d)

    //close for
    }
}
