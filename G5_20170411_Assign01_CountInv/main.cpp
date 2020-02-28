// GROUP:   5
// ID:      20170411
// Assign:  04
// Assign:  CountInv
// UVA:     10810
// Name:    Moaaz Hasan Al-rahabi

#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <iostream>
using namespace std;

////////////////////////////////////////////////////////////////////////////////////////////////////////////

long long CountInvMerge(long long* a, int n)
{
    int mid = n/2;
    int i = 0, j = mid;
    int k = 0;
    long long countSwap = 0;
    long long* M = new long long[n];
    while(i < mid || j < n)
    {
        if(i >= mid && j < n)
        {
            M[k++] = a[j++];
        }
        else if ((j >= n && i < mid) || (a[i] < a[j]))
        {
            M[k++] = a[i++];
        }
        else if(a[j] < a[i])
        {
            M[k++] = a[j++];
            countSwap += (mid - i);
        }
    }
    for(int l = 0 ; l < n ; l++)
    {
        a[l] = M[l];
    }
    delete[] M;
    return countSwap;
}
long long CountInv(long long* a, int n)
{
    if(n<=1){return 0;}
    int mid = n/2;
    long long countSwap = 0;
    countSwap += CountInv(a,mid);
    countSwap += CountInv(a+mid,n-mid);
    countSwap += CountInvMerge(a,n);
    return countSwap;
}

//////////////////////////5 9 1 0 5 4 3 1 2 3 0//////////////////////////////////////////////////////////////////////////////////

int main()
{
    int n;
    int enter = 2;
    long long result;
    while (true)
    {
        if(enter != 0){cin>>n;}
        else{break;}
        long long* M = new long long[n];
        for(int i = 0 ; i < n ; i++)
        {
            cin >> M[i];
        }
        result = CountInv(M,n);
        cout << result << endl;
        delete[] M;
        enter--;
    }
    return 0;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

