import React from 'react'
import {Link} from 'react-router'

export default () => {
    return (
      (
        <div>
          <h3 className="bg-danger">You session has timed out</h3>
          Go to <a href={`${location.protocol}//${location.host}${location.pathname}`}>Home</a> to sign in again.
        </div>
      )
    )
}
