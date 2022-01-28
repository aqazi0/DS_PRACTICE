#include <bits/stdc++.h>
using namespace std;

void print(vector<int> a)
{
    for (int i = 0; i < a.size(); i++)
    {
        cout << a[i] << endl;
    }
}

int intersection_of_set(vector<int> n, vector<int> m)
{
    vector<int> ans;
    sort(n.begin(), n.end());
    sort(m.begin(), m.end());
    int i = 0, j = 0, k = 0, a = n.size(), b = m.size(), curr, p;
    while (true)
    {
        if(i<a && j<b)
        {
            if (curr == m[j] && curr == n[i])
            {
                i++;
                j++;
                continue;
            }
            if (m[j] == n[i])
            {
                p = m[j];
                i++;
                j++;
            }
            else if (m[j] > n[i])
            {
                i++;
                continue;
            }
            else
            {
                j++;
                continue;
            }
        }
        else
            break;
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
    int k = intersection_of_set(n, m);
    return 0;
}
