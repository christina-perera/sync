import { getWorkDetail, toggleDeleteConfirmation } from '../actions'
import { connect } from 'react-redux'
import WorkDetailDisplay from '../components/WorkDetailDisplay'

const mapStateToProps = (state, ownProps) => {
  return {
    workDetail: state.workConfig.workDetail,
    deleted: state.workConfig.deleted,
    apiUrl: state.configs.apiUrl
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loadWorkDetail: (id) => dispatch(getWorkDetail(id)),
    deleteWork: (id) => dispatch(toggleDeleteConfirmation({
      show: true
    }))
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(WorkDetailDisplay)
