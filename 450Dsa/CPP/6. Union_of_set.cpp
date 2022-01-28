#include <bits/stdc++.h>
using namespace std;

void print(vector<int> a)
{
    for (int i = 0; i < a.size(); i++)
    {
        cout << a[i] << endl;
    }
}

int union_of_set(vector<int> n, vector<int> m)
{
    vector<int> ans;
    sort(n.begin(), n.end());
    sort(m.begin(), m.end());
    int i = 0, j = 0, k = 0, a = n.size(), b = m.size(), curr, p;
    while (true)
    {
        if (j >= a && i < b)
        {
            p = m[i];
            i++;
        }
        else if (i >= b && j < a)
        {
            p = n[j];
            j++;
        }
        else if (i >= b && j >= a)
            break;
        else
        {
            if (curr == m[i] && curr == n[i])
            {
                i++;
                j++;
                continue;
            }
            if (curr == m[i])
            {
                i++;
                continue;
            }
            if (curr == n[j])
            {
                j++;
                continue;
            }
            if (m[i] == n[j])
            {
                p = m[i];
                i++;
                j++;
            }
            else if (m[i] > n[j])
            {
                p = n[j];
                j++;
            }
            else
            {
                p = m[i];
                i++;
            }
        }
        ans.push_back(p);
        curr = ans[k];
        k++;
    }
    print(ans);
    return 0;
}

int main()
{
    vector<int> n;
    vector<int> m;
    n = {2, 1, 3, 2, 4, 2, 3, 4, 5, 6};
    m = {2, 2, 3, 1, 5, 4, 3, 1};
    int k = union_of_set(n, m);
    return 0;
}



/*
#include <bits/stdc++.h>
using namespace std;

void print(int a[], int size)
{
    cout<<size;
    for (int i = 0; i < size; i++)
    {
        cout << a[i] << endl;
    }
}

int union_of_set(int n[], int a, int m[], int b)
{
    int ans[a+b];
    sort(n, n+a);
    sort(m, m+b);
    int i = 0, j = 0, k = 0, curr, p;
    while (true)
    {
        if (j >= a && i < b)
        {   
            p = m[i];
            i++;
            if(curr==m[i])
                continue;
        }
        else if (i >= b && j < a)
        {
            p = n[j];
            j++;
            if(curr==n[j])
                continue;
        }
        else if (i >= b && j >= a)
            break;
        else
        {
            if (curr == m[i] && curr == n[i])
            {
                i++;
                j++;
                continue;
            }
            if (curr == m[i])
            {
                i++;
                continue;
            }
            if (curr == n[j])
            {
                j++;
                continue;
            }
            if (m[i] == n[j])
            {
                p = m[i];
                i++;
                j++;
            }
            else if (m[i] > n[j])
            {
                p = n[j];
                j++;
            }
            else
            {
                p = m[i];
                i++;
            }
        }
        ans[k]=p;
        curr = ans[k];
        k++;
    }
    // int size=sizeof(ans)/sizeof(int);
    print(ans,k);
    return 0;
}

int main()
{
    int n[] = {7,6,5,8,1,2};
    int m[] = {1,3,2,4,1,0,2,3,0,1};
    int a=sizeof(n)/sizeof(int);
    int b=sizeof(m)/sizeof(int);
    int k = union_of_set(n, a, m, b);
    return 0;
}
*/