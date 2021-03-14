
keyの暗号強度の確認  
```
ssh-keygen -l -f ~/.ssh/id_rsa.pub
```

keyの生成  
```
ssh-keygen -t rsa -C xxxx@xxx.xxx
```

configの編集  
```
vi ~/.ssh/config 
```

確認(yyyyの部分は、configで設定したhostname)  
```
ssh -T git@yyyy
```

#### 参考  
[ssh-keygen -l -f ~/.ssh/id_rsa.pub](https://qiita.com/suthio/items/2760e4cff0e185fe2db9)
[BitbucketにSSH認証鍵を設定する - Qiita](https://qiita.com/0084ken/items/e763c85054a5a1e2cc6c)  
[\[備忘\] 複数Githubアカウントでssh接続設定(config)を使い分ける手順 - Qiita](https://qiita.com/yampy/items/24638156abd383e08758)  

