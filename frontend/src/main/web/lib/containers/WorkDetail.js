import { getWorkDetail, deleteWork } from '../actions'
import { connect } from 'react-redux'
import WorkDetailDisplay from '../components/WorkDetailDisplay'

const mapStateToProps = (state, ownProps) => {
  return {
    workDetail: state.workConfig.workDetail
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loadWorkDetail: (id) => dispatch(getWorkDetail(id)),
    deleteWork: (id) => dispatch(deleteWork(id))
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(WorkDetailDisplay)
