#!/bin/bash

# Default stack name and target instance ID prefix
STACK_RDS_NAME_BASE="my-rds"  # ベースのスタック名
STACK_EC2_BASTION_NAME_BASE="my-ec2-bastion"  # ベースのスタック名
INSTANCE_ID_BASE="ec2-bastion-instance-id"  # ベースのインスタンスID
RDS_ENDPOIINT_BASE="rds-endpoint" # RDSエンドポイント

# Utility function to parse the --stage argument and set STACK_NAME and TARGET_INSTANCE_ID variables
# Usage: parse_stage_args "$@"
parse_stage_args() {
    STAGE="dev"  # Default stage is 'dev'

    # Parse arguments
    while [[ "$#" -gt 0 ]]; do
        case $1 in
            --stage) STAGE="$2"; shift ;;
            *) echo "Unknown parameter passed: $1"; exit 1 ;;
        esac
        shift
    done

    # Validate stage
    if [[ "$STAGE" != "dev" && "$STAGE" != "prod" ]]; then
        echo "Invalid stage specified. Use 'dev' or 'prod'."
        exit 1
    fi

    # Set stack name and target instance ID based on the stage
    STACK_NAME_RDS="${STACK_RDS_NAME_BASE}-${STAGE}"
	STACK_NAME_EC2="${STACK_EC2_BASTION_NAME_BASE}-${STAGE}"
}
