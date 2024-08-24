#!/bin/bash

# This script initiates an SSM session with port forwarding to an RDS instance.
# It fetches the RDS endpoint from the specified CloudFormation stack and
# forwards the local port to the remote RDS instance.
#
# Usage:
#   ./rds-port-forward.sh
#
# Prerequisites:
#   - AWS CLI installed and configured
#   - The target instance ID and stack name must be set correctly

# Include the stage utility functions
SCRIPT_DIR=$(dirname "$BASH_SOURCE")
source "$SCRIPT_DIR/stage-utils.sh"

# Set the base names for stack and instance ID
# STACK_NAME_BASE="MyApplicationStack"
# INSTANCE_ID_BASE="MyApplicationInstance"

parse_stage_args "$@"

INSTANCE_ID=$(aws cloudformation describe-stacks \
    --stack-name "$STACK_NAME_EC2" \
    --query "Stacks[0].Outputs[?OutputKey=='EC2InstanceIdOutput'].OutputValue" \
    --output text)

# Fetch the RDS endpoint from CloudFormation stack outputs
RDS_ENDPOINT=$(aws cloudformation describe-stacks \
    --stack-name "$STACK_NAME_RDS" \
    --query "Stacks[0].Outputs[?OutputKey=='RdsEndpointAddress'].OutputValue" \
    --output text)

# Start the SSM session with port forwarding
aws ssm start-session \
    --target "$INSTANCE_ID" \
    --document-name AWS-StartPortForwardingSessionToRemoteHost \
    --parameters '{"host":["'"$RDS_ENDPOINT"'"],"portNumber":["5432"],"localPortNumber":["5432"]}'
