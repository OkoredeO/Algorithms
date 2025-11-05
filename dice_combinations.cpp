#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
int MOD = 1000000007;
// naive approoach(brute force) below
// ll recur(int x){
//     if(x==0)return 1;
//     ll num = 0;
//     for(int i=1;i<7;i++){
//         if(i<=x){
//             num+=recur(x-i)%MOD;
//         }
//     }
//     return num;
// }

// expected approach using memoisation (the dp array) below:
ll solve(int n){
    vector<ll>dp(n+1,0);
    ll answer = 0;
    dp[0]=1;
    for(int i=1;i<n+1;i++){
        for(int j=6;j>0;j--){
            if(i-j>=0){
                dp[i]+=dp[i-j];
                dp[i]%=MOD;
            }
        }
    }
    return dp[n];
}   
 
int main(){
    int n;
    cin>>n;
    cout<<solve(n);
    return 0;
}
