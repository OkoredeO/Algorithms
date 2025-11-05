#include <bits/stdc++.h>
#define F first
#define S second
typedef long long ll;
using namespace std;
 
int solve(int n,int m){
    int count = 0;
    vector<vector<char>>map(n,vector<char>(m));
    vector<pair<int,int>>dots;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>map[i][j];
            if(map[i][j]=='.')dots.push_back({i,j});
        }
    }
    vector<vector<bool>>check(n,vector<bool>(m,false));
 
    for(int i=0;i<dots.size();i++){
        int i2 = dots[i].F;
        int j2 = dots[i].S;
        if(check[i2][j2]==false){
            queue<pair<int,int>>bfs;
            bfs.push({i2,j2});
            while(!bfs.empty()){
                i2 = bfs.front().F;
                j2 = bfs.front().S;
                bfs.pop();
                check[i2][j2]=true;
                if(j2+1<m&&map[i2][j2+1]=='.'&&check[i2][j2+1]==false){
                    bfs.push({i2,j2+1});
                    check[i2][j2+1] = true;
                }
                if(j2-1>=0&&map[i2][j2-1]=='.'&&check[i2][j2-1]==false){
                    bfs.push({i2,j2-1});
                    check[i2][j2-1] = true;
                }
                if(i2-1>=0&&map[i2-1][j2]=='.'&&check[i2-1][j2]==false){
                    bfs.push({i2-1,j2});
                    check[i2-1][j2] = true;
                }
                if(i2+1<n&&map[i2+1][j2]=='.'&&check[i2+1][j2]==false){
                    bfs.push({i2+1,j2});
                    check[i2+1][j2] = true;
                }
            }
            count++;
        }
    }
    return count;
}
 
int main() {
    int n,m;
    cin>>n>>m;
    cout<<solve(n,m);
    return 0;
}
