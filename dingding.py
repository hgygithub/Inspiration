# !/usr/bin/env python
# -*-coding:utf8-*-
# Project_name:new_project
# File_name:dingding.py
# Author: yang yang
# Time:2020年09月04日

#在测试用例中先导入 dingding模块来调用函数 运行函数
# 叮叮自动化发送信息使用说明 ,首先再群里加入机器人,将机器人的url地址,放在下边的代码中
# 要记得自己设置的机器人关键字,发送信息必须包含关键字
# 需要@某个人需要手机号
# True 代表了@所有人   False 代表个人


import json
import requests

def message(link=1):
    url = 'https://oapi.dingtalk.com/robot/send?access_token=1794e40c9c71a1b33e8d5ceeeca394063f4534e8378d15728b74b7ed7aad0bbd'
    pagrem = {
        "msgtype": "text",
        "text": {
            "content": "：%s " % ('测试报告已完成,请查收')
        },
        "at":{
            "atMobiles":[
                "13137312674"       #需要填写自己的手机号，钉钉通过手机号@对应人
            ],
            "isAtAll": False     #是否@所有人，默认否
        }
    }
    headers = {
        'Content-Type': 'application/json'
    }
    requests.post(url, data=json.dumps(pagrem), headers=headers)

if __name__ == "__main__":
    message()
