package com.mincor.flair.commands

import com.mincor.flair.proxies.UserProxy
import com.rasalexman.flairframework.interfaces.INotification
import com.rasalexman.flairframework.interfaces.proxy
import com.rasalexman.flairframework.patterns.command.SimpleCommand

/**
 * Created by a.minkin on 22.11.2017.
 */
class UserAuthCommand : SimpleCommand() {

    override fun execute(notification: INotification) {
        val userProxy = proxy<UserProxy>()
        val params: Array<String> = notification.body as Array<String>
        userProxy.authorization(params[0], params[1])
    }
}