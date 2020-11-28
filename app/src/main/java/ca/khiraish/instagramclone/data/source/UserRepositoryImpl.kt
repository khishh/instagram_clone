package ca.khiraish.instagramclone.data.source

import ca.khiraish.instagramclone.data.model.User
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userDataSource: UserDataSource) : UserRepository {
    override fun isSignIn(): Observable<Boolean> {
        TODO("Not yet implemented")
    }

    override fun signUp(userName: String, email: String, password: String): Completable {
        TODO("Not yet implemented")
    }

    override fun signIn(email: String, password: String): Completable {
        TODO("Not yet implemented")
    }

    override fun signOut(): Completable {
        TODO("Not yet implemented")
    }

    override fun getUser(): Observable<User> {
        TODO("Not yet implemented")
    }
}