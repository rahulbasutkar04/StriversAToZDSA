//find max depth of nested paranthesis in a string
public static int maxDepth(String S){
int current_max = 0; 
    int max = 0; 
    int n = S.size(); 
 
    
    for (int i = 0; i < n; i++) 
    { 
        if (S[i] == '(') 
        { 
            current_max++; 
            if (current_max > max) 
                max = current_max; 
        } 
        else if (S[i] == ')') 
        { 
            if (current_max > 0) 
                current_max--; 
            else
                return -1; 
        } 
    } 
 
    
    if (current_max != 0) 
        return -1; 
 
    return max; 
} 

}

//Time Complexity->O(N)
